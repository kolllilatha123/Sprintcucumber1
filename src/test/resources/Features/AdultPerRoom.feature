Feature: verifying the adactin  functionalities

			Scenario Outline: verifying the adactin of room type details 
			Given User should entert adactin details 
			When User should login using "<username>","<password>","<location>","<hotel>","<roomtype>","<numberofrooms>","<datepickin>","<datepickout>","<adultroom>","<childroom>","<fn>","<ln>","<address>","<ccno>","<cctype>","<ccmonth>","<ccyear>" and "<cvv>"
			And User should get order id
			Then User should verify msg

			Examples: 
			|username			|password|location	|hotel				|roomtype			|numberofrooms|datepickin|datepickout|adultroom	|childroom|fn   |ln   |address|ccno            |cctype	|ccmonth|ccyear|cvv|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |2 - Two		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |3 - Three	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |4 - Four	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Standard			|1 - One      |02/09/2020|03/09/2020 |2 - Two		|2 - Two	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Deluxe				|1 - One      |02/09/2020|03/09/2020 |3 - Three	|3 - Three|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Super Deluxe	|1 - One      |02/09/2020|03/09/2020 |4 - Four	|4 - Four |latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|2 - Two      |02/09/2020|03/09/2020 |2 - Two		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|3 - Three    |02/09/2020|03/09/2020 |3 - Three	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|4 - Four     |02/09/2020|03/09/2020 |4 - Four	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|5 - Five     |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|6 - Six      |02/09/2020|03/09/2020 |2 - Two		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|7 - Seven    |02/09/2020|03/09/2020 |3 - Three	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|8 - Eight    |02/09/2020|03/09/2020 |4 - Four	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|9 - Nine     |02/09/2020|03/09/2020 |3 - Three	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|10 - Ten     |02/09/2020|03/09/2020 |4 - Four	|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|2 - Two	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|3 - Three|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|4 - Four	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Standard			|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Double				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|
			|kollilatha123|kolli123|Melbourne	|Hotel Cornice|Deluxe				|1 - One      |02/09/2020|03/09/2020 |1 - One		|1 - One	|latha|kolli|chennai|4567890876543212|VISA		|March  |2022  |678|

	
		
			
			
			




			