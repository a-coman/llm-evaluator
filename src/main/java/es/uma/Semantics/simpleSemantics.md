# Simple

**Table values interpretation:**

- **NaN** indicates the absence of attributes of that type.
- **1.0** means that the attributes are completely **different**.
*(If there is only one attribute, it also returns 1.0)*
- **0.0** means the attributes are entirely **identical**.

## AddressBook

### gen1

| name | John Doe | Acme Corp | Jane Smith | Mark Brown |
|---|---|---|---|---|
| **John Doe** | 0.0000 | 0.2852 | 0.2757 | 0.3220 | 
| **Acme Corp** | 0.2852 | 0.0000 | 0.3211 | 0.3626 | 
| **Jane Smith** | 0.2757 | 0.3211 | 0.0000 | 0.2700 | 
| **Mark Brown** | 0.3220 | 0.3626 | 0.2700 | 0.0000 | 


| title | Software Engineer | Project Manager | Marketing Director |
|---|---|---|---|
| **Software Engineer** | 0.0000 | 0.2293 | 0.2781 | 
| **Project Manager** | 0.2293 | 0.0000 | 0.2049 | 
| **Marketing Director** | 0.2781 | 0.2049 | 0.0000 | 


| city | New York | San Francisco | Chicago |
|---|---|---|---|
| **New York** | 0.0000 | 0.2234 | 0.2352 | 
| **San Francisco** | 0.2234 | 0.0000 | 0.2290 | 
| **Chicago** | 0.2352 | 0.2290 | 0.0000 | 


| street | Broadway | Market Street | Michigan Avenue |
|---|---|---|---|
| **Broadway** | 0.0000 | 0.2906 | 0.2456 | 
| **Market Street** | 0.2906 | 0.0000 | 0.2183 | 
| **Michigan Avenue** | 0.2456 | 0.2183 | 0.0000 | 


| comment | Discuss project milestones | Follow-up on proposal |
|---|---|---|
| **Discuss project milestones** | 0.0000 | 0.2465 | 
| **Follow-up on proposal** | 0.2465 | 0.0000 | 


| industry | Technology |
|---|---|
| **Technology** | 0.0000 | 


### gen2

| name | Tech Solutions | Alice Wong | Bob Carter |
|---|---|---|---|
| **Tech Solutions** | 0.0000 | 0.3723 | 0.3792 | 
| **Alice Wong** | 0.3723 | 0.0000 | 0.3239 | 
| **Bob Carter** | 0.3792 | 0.3239 | 0.0000 | 


| title | Chief Executive Officer | Operations Manager |
|---|---|---|
| **Chief Executive Officer** | 0.0000 | 0.2073 | 
| **Operations Manager** | 0.2073 | 0.0000 | 


| city | Los Angeles | Seattle |
|---|---|---|
| **Los Angeles** | 0.0000 | 0.2272 | 
| **Seattle** | 0.2272 | 0.0000 | 


| street | Sunset Boulevard | Pine Street |
|---|---|---|
| **Sunset Boulevard** | 0.0000 | 0.3047 | 
| **Pine Street** | 0.3047 | 0.0000 | 


| comment | Sent quarterly earnings report | Reminder for annual strategic planning meeting |
|---|---|---|
| **Sent quarterly earnings report** | 0.0000 | 0.3084 | 
| **Reminder for annual strategic planning meeting** | 0.3084 | 0.0000 | 


| industry | Consulting |
|---|---|
| **Consulting** | 0.0000 | 


### ALL Gen detailed

| name | John Doe | Acme Corp | Jane Smith | Mark Brown | Tech Solutions | Alice Wong | Bob Carter |
|---|---|---|---|---|---|---|---|
| **John Doe** | 0.0000 | 0.2852 | 0.2757 | 0.3220 | 0.3494 | 0.3177 | 0.3125 | 
| **Acme Corp** | 0.2852 | 0.0000 | 0.3211 | 0.3626 | 0.3434 | 0.2990 | 0.3402 | 
| **Jane Smith** | 0.2757 | 0.3211 | 0.0000 | 0.2700 | 0.3713 | 0.3066 | 0.3154 | 
| **Mark Brown** | 0.3220 | 0.3626 | 0.2700 | 0.0000 | 0.3675 | 0.3305 | 0.2989 | 
| **Tech Solutions** | 0.3494 | 0.3434 | 0.3713 | 0.3675 | 0.0000 | 0.3723 | 0.3792 | 
| **Alice Wong** | 0.3177 | 0.2990 | 0.3066 | 0.3305 | 0.3723 | 0.0000 | 0.3239 | 
| **Bob Carter** | 0.3125 | 0.3402 | 0.3154 | 0.2989 | 0.3792 | 0.3239 | 0.0000 | 


| title | Software Engineer | Project Manager | Marketing Director | Chief Executive Officer | Operations Manager |
|---|---|---|---|---|---|
| **Software Engineer** | 0.0000 | 0.2293 | 0.2781 | 0.2796 | 0.2770 | 
| **Project Manager** | 0.2293 | 0.0000 | 0.2049 | 0.2572 | 0.1649 | 
| **Marketing Director** | 0.2781 | 0.2049 | 0.0000 | 0.1719 | 0.2085 | 
| **Chief Executive Officer** | 0.2796 | 0.2572 | 0.1719 | 0.0000 | 0.2073 | 
| **Operations Manager** | 0.2770 | 0.1649 | 0.2085 | 0.2073 | 0.0000 | 


| city | New York | San Francisco | Chicago | Los Angeles | Seattle |
|---|---|---|---|---|---|
| **New York** | 0.0000 | 0.2234 | 0.2352 | 0.2131 | 0.2605 | 
| **San Francisco** | 0.2234 | 0.0000 | 0.2290 | 0.1783 | 0.1888 | 
| **Chicago** | 0.2352 | 0.2290 | 0.0000 | 0.2039 | 0.2297 | 
| **Los Angeles** | 0.2131 | 0.1783 | 0.2039 | 0.0000 | 0.2272 | 
| **Seattle** | 0.2605 | 0.1888 | 0.2297 | 0.2272 | 0.0000 | 


| street | Broadway | Market Street | Michigan Avenue | Sunset Boulevard | Pine Street |
|---|---|---|---|---|---|
| **Broadway** | 0.0000 | 0.2906 | 0.2456 | 0.2484 | 0.2922 | 
| **Market Street** | 0.2906 | 0.0000 | 0.2183 | 0.3356 | 0.1938 | 
| **Michigan Avenue** | 0.2456 | 0.2183 | 0.0000 | 0.2820 | 0.2239 | 
| **Sunset Boulevard** | 0.2484 | 0.3356 | 0.2820 | 0.0000 | 0.3047 | 
| **Pine Street** | 0.2922 | 0.1938 | 0.2239 | 0.3047 | 0.0000 | 


| comment | Discuss project milestones | Follow-up on proposal | Sent quarterly earnings report | Reminder for annual strategic planning meeting |
|---|---|---|---|---|
| **Discuss project milestones** | 0.0000 | 0.2465 | 0.3006 | 0.2789 | 
| **Follow-up on proposal** | 0.2465 | 0.0000 | 0.3055 | 0.2897 | 
| **Sent quarterly earnings report** | 0.3006 | 0.3055 | 0.0000 | 0.3084 | 
| **Reminder for annual strategic planning meeting** | 0.2789 | 0.2897 | 0.3084 | 0.0000 | 


| industry | Technology | Consulting |
|---|---|---|
| **Technology** | 0.0000 | 0.3124 | 
| **Consulting** | 0.3124 | 0.0000 | 


### ALL Gen top-diag mean

| AddressBook | name | title | city | street | comment | industry |
|---|---|---|---|---|---|---|
| **gen1** | 0.3061 | 0.2374 | 0.2292 | 0.2515 | 0.2465 | 1.0000 | 
| **gen2** | 0.3585 | 0.2073 | 0.2272 | 0.3047 | 0.3084 | 1.0000 | 


| AddressBook | name | title | city | street | comment | industry |
|---|---|---|---|---|---|---|
| **Across Gen** | 0.3269 | 0.2279 | 0.2189 | 0.2635 | 0.2883 | 0.3124 |