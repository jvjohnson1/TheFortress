Overt actions (which should work with the required rank). The * indicated MVP.
    As a private, I need to:
        View my assigned duties*
        View my personal data*
        View issued equipment
        Report equipment missing or damaged
        Report duties complete
    (Note: nothing a private does directly modifies the database - access is read only.
    When a private reports something, would be assumed that the Lieutenant confirms it
    and then makes the change. That feature is not MVP.)    
    As a Lieutenant, I need to: 
        View entire platoon*
        Search for a private by ID*
            Should not display a soldier in another platoon!
        Assign duties to privates*
        Remove duties from privates*
        Update personal data*
        Check out equipment
        Check back equipment
        Confirm duties complete
    As a Captain, I need to: 
        View entire company*
        View selected platoon
        Search for a private by ID* in any platoon
        Assign duties to platoons
        Remove duties from platoons
        Define new duties (lieutenants can't do this)
        Add soldiers (users)*
    As a Captain and a Lieutenant in agreement, we may need to remove a solder from the
    company.  This demonstrates separation of duties, and while it's a bit complicated, it
    is part of MVP because it is essential in high-security applications.*
            
Misuse Cases
    As a hacker, I will launch a dictionary attack against passwords*
    As a hacker, I will manipulate urls to change directory traversal
    As a hacker, I will browse directly to pages that should require a login* 
    As a hacker, I will change the session token to gain higher access rights*
    As a hacker, I will get a shell on the server and access the database directly.
    As a hacker, I will inject SQL to alter the logic of a query.*
    As a hacker, I will inject JavaScript to run whatever code I want.