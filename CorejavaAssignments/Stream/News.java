package Stream;

public class News {
	 int newsid;
	    String postedbyuser;
	    String commentedbyuser;
	    String comment;


	public  News(int newsid, String postedbyuser,String commentedbyuser,String comment)
	  {
	    this. newsid=newsid;
	    this. postedbyuser= postedbyuser;
	    this. commentedbyuser=commentedbyuser;
	    this.comment=comment;
	  }
	 public int getNewsid() {
	        return newsid;
	    }
	    public void setNewsid(int newsid) {
	        this.newsid = newsid;
	    }

	    public String getpostedbyuser() {
	        return postedbyuser;
	    }
	    public void setPostedByUser(String postedbyuser) {
	        this.postedbyuser = postedbyuser;
	    }

	    public String getcommentedbyuser() {
	        return commentedbyuser;
	    }
	    public void setcommentedbyuser(String commentedbyuser) {
	        this.commentedbyuser = commentedbyuser;
	    }

	    public String getcomment() {
	        return comment;
	    }
	    public void setcomment(String comment) {
	        this.comment = comment;
	    }
	    @Override
	    public String toString() {
	        return "News [newsid=" + newsid + ", postedbyuser=" + postedbyuser + ", commentedbyuser=" + commentedbyuser
	                + ", comment=" + comment + "]";
	    }
}
