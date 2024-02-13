package collection.vector;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer){
        this.content = content;
        this.subject = subject;
        this.writer = writer;
    }
    public String getSubject(){
        return subject;
    }
    public String getContent(){
        return content;
    }
    public String getWriter(){
        return writer;
    }

    public String toString(){
        return "제목 : " +subject + "내용 : " + content + "글쓴이 : " + writer;
    }
}
