
import java.io.Serializable;
import java.util.Objects;

public class Word implements Serializable{
    /**
     * Serializable chuyển đổi các đối tượng thành stream, tạo tuần từ
     */
    protected String word_target;
    protected String spelling;
    protected String word_explain;
    /**
     * getWord_target()
     * @return word_target
     */
    public String getWord_target() {
        return word_target;
    }
    /**
     * setWord_target(String word_target)
     * @param word_target 
     */
    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }
    /**
     * getWord_explain()
     * @return word_explain
     */
    public String getWord_explain() {
        return word_explain;
    }
    /**
     * setWord_explain(String word_explain)
     * @param word_explain 
     */
    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    /**
     * getSpelling()
     * @return spelling
     */
    public String getSpelling() {
        return spelling;
    }
    /**
     * setSpelling(String spelling)
     * @param spelling 
     */
    public void setSpelling(String spelling) {
        this.spelling = spelling;
    }
}
