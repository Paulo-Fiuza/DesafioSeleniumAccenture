Feature: Preencher todos os formulários e validar a mensagem final.

  Scenario: Validar a mensagem "Sending e-mail success!" após o preenchimento de todos os formularios.
    Given que acesso a URL
    And realizo a validacao do formulario Enter Vehicle Data
    And preencho o campo MAKE
    And preencho o campo Model
    And preencho o campo Cylinder Capacity [ccm]
    And preencho o campo Engine Performance [kW]
    And preencho o campo Date of Manufacture
    And preencho o campo Number of Seats
    And preencho o campo Right Hand Drive
    And preencho o campo Number of Seats Motorcycle
    And preencho o campo Fuel Type
    And preencho o campo Payload [kg]
    And preencho o campo Total Weight [kg]
    And preencho o campo List Price [$]
    And preencho o campo License Plate Number
    And preencho o campo Annual Mileage [mi]
    And clico em Next
    And realizo a validacao do formulario Enter Insurant Data
    And preencho o campo First Name
    And preencho o campo Last Name
    And preencho o campo Date of Birth
    And Seleciono uma opcao Gender
    And preencho o campo Street Address
    And preencho o campo Country
    And preencho o campo Zip Code
    And preencho o campo City
    And preencho o campo Occupation
    And Seleciono uma opcao Hobbies
    And preencho o campo Website
    And clico em nextenterproductdata
    And realizo a validacao do formulario Enter Product Data
    And preencho o campo Start Date
    And preencho o campo Insurance Sum [$]
    And preencho o campo Merit Rating
    And preencho o campo Damage Insurance
    And Seleciono uma opcao Optional Products
    And preencho o campo Courtesy Car
    And realizo a validacao do formulario Select Price Option
    And clico em nextselectpriceoption
    And preencho o campo Select Option
    And clico em nextsendquote
    And realizo a validacao do formulario Send Quote
    And preencho o campo E-Mail
    And preencho o campo Phone
    And preencho o campo Username
    And preencho o campo Password
    And preencho o campo Confirm Password
    And preencho o campo Comments
    When clico em sendemail
    Then Valido a mensagem Sending e-mail success!
    And clicar em confirm