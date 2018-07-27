<!DOCTYPE html>
<html lang="en" xmlns:opacity="http://www.w3.org/1999/xhtml" xmlns:background-color="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Interests</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
    <style>
        .card-panel {margin-top: 25px;
            margin-right: 500px;
            margin-left: 500px;
        }
        .header{
            background-color: #fec700;
            height: 150px;
        }
    </style>
</head>
<body background="bckg.jpg">
<div class="header">
    <img src="Expedia-Logo-EPS-vector-image.png" alt="Italian Trulli" style="width:150px;height:100px; margin-left: 250px ;margin-right: 250px;">
    <nav style="background-color: #fec700; ">
        <div class="nav-wrapper"  style=" margin-left: 250px ;margin-right: 250px;  ">
            <ul id="nav-mobile" class="left hide-on-med-and-down">
                <li><a href="sass.html"><font color="black">Home</font></a></li>
                <li><a href="badges.html"><font color="black">Flights</font></a></li>
                <li><a href="collapsible.html"><font color="black">Hotels</font></a></li>
                <li><a href="collapsible.html"><font color="black">Discover</font></a></li>
                <li><a href="collapsible.html"><font color="black">Flight+Hotel</font></a></li>
                <li><a href="collapsible.html"><font color="black">Car Hire</font></a></li>
                <li><a href="collapsible.html"><font color="black">Holiday Activities</font></a></li>
                <li><a href="collapsible.html"><font color="black">Last Minute Deals</font></a></li>
                <li><a href="collapsible.html"><font color="black">Deals</font></a></li>
                <li><a href="collapsible.html"><font color="black">Rewards</font></a></li>
                <li><a href="collapsible.html"><font color="black">Mobile</font></a></li>
                <li><a href="collapsible.html"><font color="black">Travel Blog</font></a></li>
            </ul>
        </div>
    </nav>
</div>
<div class="card-panel"  background-color: rgba(128, 0, 0, 0.4);>
    <form class="col s6">
        <div class="row">
            <div class="col s12">
                <div class="card blue-grey darken-1">
                    <div class="card-content white-text">
                        <!--TODO JSP NAME-->
                        <span class="card-title" style="text-transform: capitalize">>${name}</span>
                        <p style="text-transform: capitalize">${location}</p>
                        <p>${initialDate}-${finalDate}</p>
                        <p>${phone}</p>
                        <p>${email}</p>
                    </div>
                </div>
            </div>
        </div>
        In order for us to find you the most appropriate group to hang out with, kindly let us know a few things in regards to your trip. Like what you would like to do and few other things.
        <h5>Interested in:</h5>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Trekking</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Religious</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Local Interaction</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Sports</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Sightseeing</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Night Life</span>
            </label>
        </p>
        <h5>You are comfortable with:</h5>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Smoking</span>
            </label>
        </p>
        <p>
            <label>
                <input type="checkbox" class="filled-in" />
                <span>Drinking</span>
            </label>
        </p>
        <!--<div class="input-field col s12" style="height: auto ">-->
        <!--<select data-placeholder="Choose a Language...">-->
        <!--</select>-->
        <!--</div>-->
        <div>
            <label>Preferred Language</label>
            <select class="browser-default" name="lang" data-placeholder="Choose a Language...">
                <option value="1">English</option>
                <option value="2">French</option>
                <option value="3">German</option>
                <option value="4">Spanish</option>
                <option value="5">Portuguese</option>
            </select>
        </div>
        <div>
            <label>Age Group Preference</label>
            <select class="browser-default" name="age">
                <option value="1"> < 30 </option>
                <option value="2">30-40</option>
                <option value="3">40-50</option>
                <option value="4"> > 50</option>
            </select>
        </div>
        <button class="btn waves-effect waves-light" type="submit"  id = "myBtn" style="margin-top: 15px; background-color: #fec700;" onclick="myFunction()"><font color="black">
            Submit
        </font>
            <i class="material-icons right"></i>
        </button>
    </form>
</div>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('select');
        var instances = M.FormSelect.init(elems, options);
    });
    $(document).ready(function() {
        $('select').attr("class", "browser-default")
    });
    function myFunction(){
        alert("You will be notified about your group around 5 days prior to your travel!!")
    }
</script>
</body>
</html>