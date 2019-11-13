package com.jguo3.school.htmlviewresolver;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.InternalResourceView;

/**
 * Description:TODO
 * @author:jguo3
 * Date:Nov 13, 2019 3:31:13 PM
 * 
 */
public class htmlResourceView extends InternalResourceView{
	/**
     * <p>AbstractUrlBasedView中的checkResource永远都返回true，表示视图存在，不会再进入其他的视图解析器。
     * 重写了checkResource方法，若当前视图无法解析，则返回false，使之能够进入下一个视图。</p>
     * @author jguo3
     **/
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        File file = new File(this.getServletContext().getRealPath("/") + getUrl());
        return file.exists();
    }

}
