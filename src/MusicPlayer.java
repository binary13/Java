import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by justin on 3/19/2016.
 */
public class MusicPlayer {

    class Playlist {
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

    class Album {
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

    class Song {
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
