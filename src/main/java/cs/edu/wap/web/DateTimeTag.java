package cs.edu.wap.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTag extends SimpleTagSupport {
    String color;
    double size = 0;

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter jspWriter = getJspContext().getOut();
        if (color != null) {
            Date date = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
            jspWriter.write(" <span style=\"color: " + color + "; font-size: " + size + "px;\">" + ft.format(date) + "</span>");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
