package com.yiyun.Rule02;

public class NutritionFacts {
    private final int servingSize;
    private  final  int servings;
    private  int calories;
    private  int fat;
    private  int sodium;
    private  int carbohydrate;
    public static class Builder{
        private final int servingSize;
        private  final  int servings;

        private  int calories=0;
        private  int fat=0;
        private  int sodium=0;
        private  int carbohydrate=0;
        public Builder(int servingsize,int servings){
            this.servingSize=servingsize;
            this.servings=servings;
        }
        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }
    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
