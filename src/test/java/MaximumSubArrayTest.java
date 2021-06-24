import com.loic.projectfacebook.leetcode.easy.MaximumSubArray;
import org.junit.*;
import static org.junit.Assert.*;

public class MaximumSubArrayTest {
    @Test
    public void testMaxSubArray(){

        //MaximumSubArray max  = new MaximumSubArrayTest();
        MaximumSubArray max = new MaximumSubArray();
        int [] a = {4,-1,2,1};
        int i = max.maxSubArraySum(a);
        assertEquals(6,i);

    }

}
