class Article2 implements Comparable<Article2> {
    private String title;
    private int size;

    public Article2(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article2 otherArticle) {
        int compareBySize = this.size - otherArticle.size;
        if (compareBySize != 0) {
            return compareBySize;
        }
        return this.title.compareTo(otherArticle.title);
    }
}