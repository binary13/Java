import java.io.IOException;
import java.util.*;

/**
 * Created by justin on 3/19/2016.
 */
public class MusicPlayer {

    public static void main(String[] args) {

        Playlist plist = new Playlist();

        Album album = new Album("Rolling Along", "The Round Wheels");
        album.addSong("Wheelie", 3.28);
        album.addSong("Cruisin'", 2.56);
        album.addSong("The Wheels on the Bus", 7.32);
        album.addSong("The Long and Winding Road", 4.56);
        plist.addAlbum(album);

        album = new Album("Death and Puppies", "Condescending Irony");
        album.addSong("The Ironic Twists of Poetic Justice, Part III", 10.23);
        album.addSong("I don't like you at all", 4.17);
        album.addSong("A Hipster Anthem", 4.44);
        album.addSong("Nobody's Doing It", 3.45);
        plist.addAlbum(album);

        plist.showSongs();

        plist.play();








    }



    static class Playlist {
        private LinkedList<Song> songs = new LinkedList<>();


        public Playlist() {
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean forward = true;
            ListIterator<Song> iter = this.songs.listIterator();

            if(songs.size() == 0) {
                System.out.println("Playlist is empty.");
            } else {
                System.out.println("Now playing " + iter.next().print());

                while(!quit) {
                    System.out.println("Menu: ");
                    System.out.println("\t 1. Play the next song");
                    System.out.println("\t 2. Play the previous song");
                    System.out.println("\t 3. Play from the beginning");
                    System.out.println("\t 4. Remove current song from playlist");
                    System.out.println("\t 5. Print playlist");
                    System.out.println("\t 0. Exit");

                    int choice;
                    String line = scanner.nextLine();
                    try {
                        choice = Integer.parseInt(line);
                    }
                    catch(NumberFormatException|InputMismatchException ex){
                        choice = 0;
                    }

                    switch(choice) {
                        case 1:
                            if(iter.hasNext()){
                                if(!forward) {
                                    iter.next();
                                    forward = true;
                                }
                                System.out.println("Now playing " + iter.next().print());

                            }
                            else {
                                System.out.println("End of playlist.");
                            }
                            break;
                        case 2:
                            if(iter.hasPrevious()) {
                                if(forward) {
                                    iter.previous();
                                    forward = false;
                                }
                                System.out.println("Now playing " + iter.previous().print());
                            }
                            else {
                                System.out.println("Start of playlist.");
                            }
                            break;
                        case 3:
                            iter = this.songs.listIterator(0);
                            forward = true;
                            System.out.println("Now playing " + iter.next().print());
                            break;
                        case 4:
                            System.out.println("Song removed.");
                            iter.remove();
                            break;
                        case 5:
                            this.showSongs();
                            break;
                        case 0:
                            quit = true;
                            break;
                        default:
                            quit = true;
                    }
                }
            }
        }

        public void playNext() {}

        public void playPrev() {}

        public void addSong(Song song) {
            this.songs.add(song);
        }

        public void addAlbum(Album album) {
            for(Song song : album.getSongs()) {
                this.addSong(song);
            }
        }

        public void showSongs() {
            for(int i = 0; i < this.songs.size(); i++) {
                System.out.println((i+1) + ". " + this.songs.get(i).print());
            }
        }
    }

    static class Album {
        private String title;
        private String artist;
        private ArrayList<Song> songs = new ArrayList<>();

        public Album(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public void addSong(String title, double length) {
            songs.add(new Song(title, length, this.artist));
        }

        public ArrayList<Song> getSongs() {
            return songs;
        }
    }

    static class Song {
        private String title;
        private String artist;
        private double length;

        public Song(String title, double length, String artist) {
            this.title = title;
            this.length = length;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public double getLength() {
            return length;
        }

        public String getArtist() {
            return artist;
        }

        public String print() {
            return this.getTitle() + " by " + this.getArtist();
        }
    }
}
