# jv-crypto-api

API doc: https://min-api.cryptocompare.com/documentation

1. Register on the site and get the API KEY (or use this e347a7d01149ab62ddf9b0f3a879df679d3c3bb440b7593de4b45097dad4c088)
1. Get a list of the top 10 currencies at https://min-api.cryptocompare.com/documentation?key=Toplists&cat=TopTotalVolumeEndpointFull
1. Provide information on the bids and asks of all 10 currencies to the bitcoin (BTC) in the format 
(data can be obtained here https://min-api.cryptocompare.com/documentation?key=Orderbook&cat=obL1TopEndpoint)
```text
[
   { 
      "name": "USD", 
      "BID": 13187.32
      "ASK": 13187.33
   }, 
   {
      "name": "EUR", 
      "BID": 11164.19,
      "ASK": 11165.51
   }
   ...
]
```
The example above shows that
1 BTC best bid is USD 13187.32. Best ask is USD 13187.33.
1 BTC best bid is EUR 11164.19. Best ask is EUR 11165.51.

Your solution should be in the form of the REST API.
