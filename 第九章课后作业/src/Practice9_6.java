/**
 * @author chen
 */
import java.util.*;
public class Practice9_6{
    public static void main(String[] args) {
            StopWatch time = new StopWatch();
            int[] nums = new int[100000];
            for(int i = 1; i <= 100000; ++i)
                nums[i - 1] = (int)((System.currentTimeMillis() / i) % 1000);

            time.start();
            for(int i = 0; i < 99999; ++i){
                int idx=i;
                for(int j = i+1; j < 100000; ++j){
                    if(nums[j] > nums[idx]){
                        idx=j;
                    }
                }
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
            }
            time.stop();

            System.out.println(time.getElapsedTime());
        }


    static class StopWatch{
        private long startTime;
        private long endTime;
//        public void setStartTime(long newStartTime){
//            startTime = newStartTime;
//        }
//        public void setEndTime(long newEndTime){
//            endTime = newEndTime;
//        }
//        public StopWatch(){
//            startTime = System.currentTimeMillis();
//        }

        public void start(){
            startTime = System.currentTimeMillis();
        }

        public void stop(){
            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime(){
            return endTime - startTime;
        }
    }
}