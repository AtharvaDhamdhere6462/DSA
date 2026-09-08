class StockSpanner {
    private List<Integer> prices;
    private Stack<Integer> s;
    public StockSpanner() {
        prices = new ArrayList<>();
        s= new Stack<>();
    }
    
    public int next(int price) {
        int i = prices.size();
        prices.add(price);


        while (!s.isEmpty() && price >= prices.get(s.peek())) {
            s.pop();
        }
        
        int span;
        if (s.isEmpty()) {
            span = i + 1;
        } else {
            int prevHigh = s.peek();
            span = i - prevHigh;
        }
        
        s.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */