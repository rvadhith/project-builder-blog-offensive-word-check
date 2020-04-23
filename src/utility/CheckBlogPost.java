package utility;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {

	String offensiveWords[] = {"a55", "a55hole", "acrotomophilia", "aeolus", "ahole", "alabama hot pocket", "alaskan pipeline", "anal", "anal impaler", "anal leakage",	"analprobe", "anilingus", "anus", "apeshit", "ar5e", "areola", "areole", "arian", "arrse", "arse", "arsehole", "aryan", "ass", "ass fuck", "ass hole"};
	
	
	@Override
	public boolean checkBlogTitle(Blog blog) {
		String blogTitle = blog.getBlogTitle().toLowerCase();
		String wordsInTitle[] = blogTitle.split(" ") ;
		for(int i = 0; i < 25; i++) {
			for(int j= 0; j < wordsInTitle.length; j++) {
				if(wordsInTitle[j] == offensiveWords[i]) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public boolean checkBlogDescription(Blog blog) {
		String blogDescription = blog.getBlogDescription().toLowerCase();
		String wordsInDescription[] = blogDescription.split(" ") ;
		for(int i = 0; i < 25; i++) {
			for(int j= 0; j < wordsInDescription.length; j++) {
				if(wordsInDescription[j] == offensiveWords[i]) {
					return false;
				}
			}
		}
		return true;
	}
		

	@Override
	public boolean checkBlog(Blog blog) {
		if((checkBlogTitle(blog)) && (checkBlogDescription(blog))) {
			return true;
		}
		return false;
	}
	
}