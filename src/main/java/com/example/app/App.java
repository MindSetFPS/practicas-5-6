package com.example.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        View.RenderUi();
        CoinCounter coinCounter = new CoinCounter();
        View.createSingleInputView(coinCounter);
    }
}