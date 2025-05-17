# gRPC-Bidirectional

```
grpcurl -d @ \
  -plaintext \
  -import-path ~/Downloads/stock-trading-server/src/main/proto \
  -proto stock_trading.proto \
  localhost:9090 \
  stocktrading.StockTradingService/liveTrading < order.txt
```
