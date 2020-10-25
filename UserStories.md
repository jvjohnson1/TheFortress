* Overt actions (which should work with the required rank).
    * As a private, I need to:
        * View my assigned duties
        * View my personal data*
        * View issued equipment
        * Report equipment missing or damaged
        * Report duties complete 
    * As a Lieutenant, I need to: 
        * View entire platoon*
        * Search for a private by ID*
            * Should not display a soldier in another platoon!*
        * Assign duties to privates
        * Remove duties from privates
        * Update personal data for any member of platoon, self included*
        * Check out equipment
        * Check back equipment
        * Confirm duties complete
    * As a Captain, I need to: 
        * View entire company*
        * View selected platoon*
        * Search for a private by ID in any platoon*
        * Assign duties to platoons
        * Remove duties from platoons
        * Define new duties (lieutenants can't do this)
        * Add soldiers (users)*
    * As a Captain and a Lieutenant in agreement, we may need to remove a solder         
* Misuse Cases
    * As a hacker, I will launch a dictionary attack against passwords
    * As a hacker, I will manipulate urls to change directory traversal
    * As a hacker, I will browse directly to pages that should require a login 
    * As a hacker, I will change the session token to gain higher access rights*
    * As a hacker, I will get a shell on the server and access the database directly.
    * As a hacker, I will inject SQL to alter the logic of a query.
    * As a hacker, I will inject JavaScript to run whatever code I want.
    * As a hacker, I mark a checkbox to say if got in without being given a password.
    * As a hacker, I post to brag board about how I got in (from officer accounts only)