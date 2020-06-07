# All Customers

{% api-method method="get" host="https://bank-backend-springboot.herokuapp.com/" path="bank/1/customers" %}
{% api-method-summary %}

{% endapi-method-summary %}

{% api-method-description %}

{% endapi-method-description %}

{% api-method-spec %}
{% api-method-request %}

{% api-method-response %}
{% api-method-response-example httpCode=200 %}
{% api-method-response-example-description %}

{% endapi-method-response-example-description %}

```
[
    {
        "panNumber": "ABC123",
        "accounts": [
            {
                "accountNumber": "1",
                "minimumBalance": 10000.0,
                "currentBalance": 0.0,
                "interestRate": 0.0,
                "listOfTxns": [],
                "accountType": "Current"
            },
            {
                "accountNumber": "2",
                "minimumBalance": 20000.0,
                "currentBalance": 0.0,
                "interestRate": 4.5,
                "listOfTxns": [
                    {
                        "transactionID": "1",
                        "amount": 2000.0,
                        "type": "deposit",
                        "txnDate": "Sun, Jun 07 2020 10:54:34"
                    }
                ],
                "accountType": "Saving"
            }
        ]
    }
]
```
{% endapi-method-response-example %}
{% endapi-method-response %}
{% endapi-method-spec %}
{% endapi-method %}



{% hint style="info" %}
Hints
{% endhint %}

