# SurfSpot

<h3>Find your best surfing spot</h3>
<h2>About</h2>
<p> This REST API type of application allows to find the best surfing spot around the world for a given date. It makes calculations based on WeatherBit API weather data.</p>
<h2>Setup</h2>
<ol>
<li>Create .env file in your src/main/resources directory. Put there following line for your WeatherBit API key: API_KEY="Your API key goes here".</li>
<li>Setup a list of cities and their respective countries in cities.txt. Use following format for each line: >cityname<,>countryname<</li>
<li>Give it a go! This app is designed for WeatherBit API's BASIC (free) pricing plan - only 7 days forecast available.</li>
</ol>

<h2>Use instructions</h2>
<p>In order to use API send a HTTP GET request to the path >yourip/siteadess>/api/v1/surfspots/best including date parameter <b>?date="uuuu-mm-dd"</b> where uuuu - given year, mm - given month, dd - given day.</p>
<p>If your request is valid, you will receive best surfing spot city name, forecasted wind speed and temperature.</p>
