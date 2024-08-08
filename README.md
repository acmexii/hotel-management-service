# 

## Model
www.msaez.io/#/storming/1a52cd036f90445a6231f62319d272cd

## Before Running Services
### Make sure there is a Kafka server running
```
cd kafka
docker-compose up
```
- Check the Kafka messages:
```
cd infra
docker-compose exec -it kafka /bin/bash
cd /bin
./kafka-console-consumer --bootstrap-server localhost:9092 --topic
```

## Run the backend micro-services
See the README.md files inside the each microservices directory:

- reservation-management
- room-management
- checkinout-management
- payment-management


## Run API Gateway (Spring Gateway)
```
cd gateway
mvn spring-boot:run
```

## Test by API
- reservation-management
```
 http :8088/reservations reservationId="reservationId" customerId="customerId" roomId="roomId" startDate="startDate" endDate="endDate" status="status" statusType="statusType" 
```
- room-management
```
 http :8088/rooms roomId="roomId" roomNumber="roomNumber" status="status" statusType="statusType" 
```
- checkinout-management
```
 http :8088/checkInOuts checkInOutId="checkInOutId" reservationId="reservationId" roomId="roomId" status="status" statusType="statusType" 
```
- payment-management
```
 http :8088/payments paymentId="paymentId" reservationId="reservationId" customerId="customerId" status="status" statusType="statusType" 
```


## Run the frontend
```
cd frontend
npm i
npm run serve
```

## Test by UI
Open a browser to localhost:8088

## Required Utilities

- httpie (alternative for curl / POSTMAN) and network utils
```
sudo apt-get update
sudo apt-get install net-tools
sudo apt install iputils-ping
pip install httpie
```

- kubernetes utilities (kubectl)
```
curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"
sudo install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl
```

- aws cli (aws)
```
curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
unzip awscliv2.zip
sudo ./aws/install
```

- eksctl 
```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/latest/download/eksctl_$(uname -s)_amd64.tar.gz" | tar xz -C /tmp
sudo mv /tmp/eksctl /usr/local/bin
```

