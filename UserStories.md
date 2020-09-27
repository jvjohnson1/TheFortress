* Overt actions (which should work with the required rank). The * indicated MVP.
    * As a private, I need to:
        * View my assigned duties*
        * View my personal data*
        * View issued equipment
        * Report equipment missing or damaged
        * Report duties complete 
    * As a Lieutenant, I need to: 
        * View entire platoon*
        * Search for a private by ID*
            * Should not display a soldier in another platoon!
        * Assign duties to privates*
        * Remove duties from privates*
        * Update personal data*
        * Check out equipment
        * Check back equipment
        * Confirm duties complete
    * As a Captain, I need to: 
        * View entire company*
        * View selected platoon
        * Search for a private by ID* in any platoon
        * Assign duties to platoons
        * Remove duties from platoons
        * Define new duties (lieutenants can't do this)
        * Add soldiers (users)*
    * As a Captain and a Lieutenant in agreement, we may need to remove a solder         
* Misuse Cases
    * As a hacker, I will launch a dictionary attack against passwords*
    * As a hacker, I will manipulate urls to change directory traversal
    * As a hacker, I will browse directly to pages that should require a login* 
    * As a hacker, I will change the session token to gain higher access rights*
    * As a hacker, I will get a shell on the server and access the database directly.
    * As a hacker, I will inject SQL to alter the logic of a query.*
    * As a hacker, I will inject JavaScript to run whatever code I want.
    
A hacker who gains access as a private will be able to check a box near the
Logout button, saying they got in without being provided a password.  This will
be logged.

If a hacker gains access as an officer, they will be able to record a post about
how they got in, but once entered this is not editable, nor is there any tool for
searching these comments from within the application.  Hackers do not get clues
from each other!