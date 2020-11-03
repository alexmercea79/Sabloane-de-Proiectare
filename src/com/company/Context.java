package com.company;

public abstract class Context implements AlignStrategy{
        private AlignStrategy strategy;

        public Context(AlignStrategy strategy){
            this.strategy = strategy;
        }

    public void render(String paragraph, String Context) {
        System.out.println(strategy+"ddd");
    }
}
