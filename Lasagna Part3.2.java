public class Lasagna {

        int mins = 40;

        public int expectedMin(){
            return mins;
        }

        public int remainMin(int minsPassed){
            return mins-minsPassed;
            
        }
        public int prepTime(int layers){
            return layers * 2;
        }

        public int totalTime(int layers, int mins){
            return mins + prepTime(layers);

        }
    
    
        

        }
