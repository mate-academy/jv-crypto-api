# jv-crypto-api


1. Register on the site and get the API KEY (or use this e347a7d01149ab62ddf9b0f3a879df679d3c3bb440b7593de4b45097dad4c088)
1. Get a list of the top 10 currencies at https://min-api.cryptocompare.com/data/top/totalvolfull?limit=10&tsym=USD
1. Provide information on the ratio of all 10 currencies to the hryvnia (UAH) in the format (data can be obtained here https://min-api.cryptocompare.com/data/price?fsym=BTC&tsyms=USD,JPY)
[
   { 
      "name": "USD", 
      "price": 28.50
   }, 
   {
      "name": "BTC", 
      "price": 367408.14
   }
   ...
]
The example above shows that
1 USD (U.S. dollar) costs UAH 28.50.
1 BTC (bitcoin) costs 367408.14 :screamingface:

Your solution should be in the form of the REST API.
