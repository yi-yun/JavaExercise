package readme;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

/**
 * @class: MyHelperUtils
 * @description: 测试工具类
 * @author: yi-yun
 * @create: 2019-08-10 17:45
 **/
public class MyHelperUtils {
    @Test
    public void funMath() {
        //round 四舍五入
        Assert.assertThat(2L, Is.is(Math.round(2.4)));
        Assert.assertThat(3L, Is.is(Math.round(2.5)));
        //ceil 不小于他的整数
        Assert.assertThat(3.0, Is.is(Math.ceil(2.4)));
        Assert.assertThat(3.0, Is.is(Math.ceil(2.5)));
        //floor 
        Assert.assertThat(2.0, Is.is(Math.floor(2.4)));
        Assert.assertThat(2.0, Is.is(Math.floor(2.6)));
    }
}
