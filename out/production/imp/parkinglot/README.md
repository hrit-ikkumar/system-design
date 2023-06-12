# Parking Lot

## Flow
Vehicle In --> Entrance Gate --> Ticket --> Parking Spot --> Payment --> Exit --> Vehicle Out

## Requirement
- How many entrances/exit (only 1 for now but code should be scalable)
- Different types of spots? (Like 2 wealer, 4 whelear)
- What are the payment strategy (Hourly based charge or one time charge or minute based charge, Mixed)
- Do we have parking floors? (For now no)
- Should we implement special mechanism to find the nearest spot to enternace gate?

## Objects
- Vehicle
  - Vehicle No
  - Vehicle Type
    - Enums (2 Whealer/ 4 whealer)
- Ticket
  - Entry Time
  - Parking Spot
- Entrance Gate
  - find parking space
  - update parking space
  - generate tickets
- Parking Spot
  - Id
  - isEmpty
  - vehicle
  - price
  - type
- Exit Gate
  - Cost Calculation
  - Payment
  - Update Parking Spot

## Approaches
- Top-Down
- Bottom-Up (We will use)