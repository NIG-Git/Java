package TagHandora;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/*** 1 ***/
public class TagHandora extends TagSupport {

	private PageContext pageContext = null;

	private String str = "";

	/*** 2 ***/
	@Override
	public void setPageContext(PageContext pageContext) {

		this.pageContext = pageContext;

	}

	/*** 3 ***/
	@Override
	public int doStartTag() throws JspException {

		/*** 4 ***/
		//ボディ部を評価する戻り値、評価しない場合は「SKIP_BODY」
		return EVAL_BODY_INCLUDE;

	}

	/*** 4 ***/
	@Override
	public int doEndTag() throws JspException {

		try {
			pageContext.getOut().print("HelloWorld");
			pageContext.getOut().print("<br>");
			pageContext.getOut().print(str);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_PAGE;

	}

	public void setStr(String str){

		this.str = str;

	}

}
