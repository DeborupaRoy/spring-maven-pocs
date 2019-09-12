package edu.deborupa.spring.html.builder;

public class HtmlBuilder {
	String htmlString = "";
	public HtmlBuilder(String baseString) {
		this.htmlString = baseString;
	}
	public HtmlBuilder addHtmlTag() {
		this.htmlString = "<html>" + this.htmlString + "</html>";
		return this;
	}
	public HtmlBuilder addHeadTag() {
		this.htmlString = "<head>" + this.htmlString + "</head>";
		return this;
	}
	public String build() {
		return this.htmlString;
	}
}
