package 创建型设计模式.建造者模式;

/**
 * @author torvalds on 2018/10/6 23:11.
 * @version 1.0
 */
public class Director {
    private Double radius;
    private String modue;
    private Double high;

    public Double getRadius() {
        return radius;
    }

    public String getModue() {
        return modue;
    }

    public Double getHigh() {
        return high;
    }

    public Director(Builder builder) {
        this.radius = builder.radius;
        this.modue = builder.modue;
        this.high = builder.high;
    }

    static class Builder {
        private Double radius;
        private String modue;
        private Double high;

        public Builder radius(Double radius) {
            this.radius = radius;
            return this;
        }

        public Builder modue(String modue) {
            this.modue = modue;
            return this;
        }

        public Builder high(Double high) {
            this.high = high;
            return this;
        }

        public Director buid() {
            return new Director(this);
        }
    }
}

class DirectorTest {
    public static void main(String[] args) {
        Director director = new Director.Builder()
                .radius(1.5D)
                .high(20D)
                .modue("test modue")
                .buid();
        System.out.println("director.getRadius() = " + director.getRadius());
    }
}
