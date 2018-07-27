<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Interests</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
</head>
<body>
<form class="col s6">
    <div class="row">
        <div class="col s12 m6">
            <div class="card blue-grey darken-1">
                <div class="card-content white-text">
                    <!--TODO JSP NAME-->
                    <span class="card-title">${name}</span>
                    <p>${location}</p>
                    <p>${initialDate}-${finalDate}</p>
                    <p>${phone}</p>
                    <p>${email}</p>
                </div>
            </div>
        </div>
    </div>
    <h5>Activities</h5>
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
    <h5>Personal Habits</h5>
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
</form>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        var elems = document.querySelectorAll('select');
        var instances = M.FormSelect.init(elems, options);
    });
    $(document).ready(function() {
        $('select').attr("class", "browser-default")
    });

</script>
</body>
</html>