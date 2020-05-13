package hust.soict.hedspi.media;

public class XmlTag {
	 
    private String tagName;
 
    public XmlTag() {
 
    }
 
    public XmlTag(String tagName) {
        this.tagName = tagName;
    }
 
    public String getTagName() {
        return tagName;
    }
 
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
 
    @Override
    public String toString() {
        return "<"+this.tagName+">";
    }
    
}