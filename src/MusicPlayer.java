import java.util.ArrayList;
import java.util.LinkedList;

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
        album.addSong("The Ironic Twist of Poetic Justice, Part III", 10.23);
        album.addSong("I don't like you at all", 4.17);
        album.addSong("A Hipster Anthem", 4.44);
        album.addSong("Nobody's Doing It", 3.45);
        plist.addAlbum(album);

        plist.play();








    }



    static class Playlist {
        private LinkedList<Song> songs;

        public Playlist() {
        }

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
                System.out.println((i+1) + ". " + this.songs.get(i).getTitle() + " by " + this.songs.get(i).getArtist());
            }
        }
    }

    static class Album {
        private String title;
        private String artist;
        private ArrayList<Song> songs;

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
    }
}
