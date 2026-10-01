package stockmarketapp;

// Dosya adınla (StockMarketApp) sınıf adın aynı olmalı
public class StockMarketApp {
    
    public static void main(String[] args) {
        Stock s1 = new Stock("ORCL", "Oracle Corporation");
        
        s1.previousClosingPrice = 34.5;
        s1.currentPrice = 34.35;

        System.out.println("Sembol: " + s1.symbol);
        System.out.println("Şirket Adı: " + s1.name);
        System.out.println("Değişim Yüzdesi: " + s1.getChangePercent());
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock() {
    }

    Stock(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
}