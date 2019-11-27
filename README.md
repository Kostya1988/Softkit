# Getting Started

### Reference Documentation
The following are the instructions for completing the test.
  For this project you will be using an open source Stocks feed API to provide incoming data. This API is open source and requires no authentication.
  The documentation (should you need to look at it)  [is here]( https://iexcloud.io/docs/api/): 
 

* [On load – query the following stocks API:]( https://sandbox.iexapis.com/stable/ref-data/symbols?token=Tpk_ee567917a6b640bb8602834c9d30e571) 
* [This gives the symbols/names/state for each trading company.](https://iexcloud.io/docs/api/#symbols)
* 	Loop through each company that is enabled and put a request onto a queue for that company to get its data.
*  	Have multiple threads processing the queue - downloading the current stock information for that company, using the following API: https://sandbox.iexapis.com/stable/stock/{stock code}/quote?token={token}  [-------> i.e. HERE]( https://sandbox.iexapis.com/stable/stock/MSFT/quote?token=Tpk_ee567917a6b640bb8602834c9d30e571)
*   [INFO]( https://iexcloud.io/docs/api/#quote)
*   Save the data from each stock quote into a DB structure that can be queried.
* 	Should output at regular intervals (every 5 seconds) the following stats:
  	The top 5 highest value stocks (in order – largest first, then order by company name)
    The most recent 5 companies that have the greatest change percent in stock value
*   Once the process has completed (looped through all companies), it should start again and download the current stock information for each company again.
*   If the information has changed for a company, then this change needs to be recorded in the DB, i.e. a log for each company of the changes to their stocks over time.

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

