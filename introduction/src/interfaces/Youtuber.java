package interfaces;

public interface Youtuber extends VideoEditor  {

	int x = 6;
        abstract void makeVideo();
    default   void uploadVideo() {
        			System.out.println("he is doing upload the videos");
        		}

        
}
