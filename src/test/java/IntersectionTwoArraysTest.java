import com.loic.projectfacebook.leetcode.easy.IntersectionTwoArrays;
import org.junit.Test;
import static org.junit.Assert.*;




public class IntersectionTwoArraysTest {

    @Test

    public void testIntersectionTwoArrays() {
        IntersectionTwoArrays two = new IntersectionTwoArrays();
        int[] nums1 = {1,3,5,6,7};
        int[] nums2 = {1,2,4,6,8};
        int[] inter = {1,6};

        int[] resultArray = two.intersection(nums1,nums2);
        assertArrayEquals(inter,resultArray);

    }

}
