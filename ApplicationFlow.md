* User Sign In
    * User clicks login button on landing page.
    * User enters username and password on form and submits.
    * If user is authenticated, home page appears according to user rank (private, lieutenant or captain) 
    * If authentication fails, show generic error, never saying if the username or the password was wrong.
    * Multiple failures will disconnect user and prevent farther tries from the same IP.
* View individual data as private
    * Automatic.  Data appears on personal home page.  There is no interaction except to log out.
* View individual data as a lieutenant or captain
    * User clicks view personal data button
    * Page sends a request to individual data servlet
    * Servlet uses user data dao to pull data for the officer who is logged in.
    * Dao returns individual's data.
    * Servlet sends data to jsp.
    * Officer's jsp displays the reports.
    * Throw exception if there is more than one result - this should never happen.
* View Platoon (as lieutenant) or Company (as captain)
    * Page sends a request with name and rank of requesting officer.
    * Servlet uses the dao to select soldiers in that lieutenant's platoon, or the entire company if a captain makes the request.
    * Dao performs select and list from results.
    * Dao returns list matching criteria to servlet.
    * Servlet sends list back to officer's jsp.
    * Officer's jsp displays the soldiers.
* Add com.thefortress.entity.Duty to com.thefortress.entity.Soldier's data
    * Option only available to officers
    * User selects soldier to perform duty
    * User selects duty from drop-down
        * (If logged in as a captian, there will be the option to enter a new duty)
    * Details are sent to Assign com.thefortress.entity.Duty servlet
    * Servlet creates new duty object
    * Servlet sends object to dao
    * Dao adds duty to soldier's personal data
* Remove duty from com.thefortress.entity.Soldier's data
    * Option only available to officers
    * User selects soldier and duty 
    * Details are sent to Remove com.thefortress.entity.Duty servlet
    * Servlet creates a RemoveDuty object
    * Servlet sends object to dao
    * Dao removes duty duty soldier's personal data
* Remove soldier
    * Officer initiating the process clicks button
    * Officer selects soldier
    * Details are sent to the remove soldier servlet
        * Servlet checks soldier data, sees this is the first call against this soldier
        * Servlet creates a marker object
    * Servlet sends object to dao
    * Dao notes the soldier's record that a removal has been initiated and by which officer
    * Officer confirming the removal clicks button
    * Officer selects soldier
    * Details are sent to the remove soldier servlet
        * Servlet checks soldier data, sees this is the final call against this soldier
        * Servlet creates a deletion object
    * Servlet sends object to dao
    * Dao removes soldier from database

