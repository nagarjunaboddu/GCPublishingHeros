
GET Heros :

Acceptance criteria : URI - /api/heros

Response status : 200 ok
Request Method : GET

Response Body:
    [
    {
    "id": "1",
    "name":"Bruce Wayne ",
    "heroName":"Batman",
    "height":178,
    "weight": 77,
    "specialPower": "Genius intellect",
    "intelligence": 81,
    "strength": 40,
    "power" : 63,
    "speed": 29,
    "agility": 50,
    "imageUrl":"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/69-batman.jpg",
    "description": "The Dark Knight",
    "story" : "After witnessing the murder of his parents Dr. Thomas Wayne and Martha Wayne as a child, he swore vengeance against criminals, an oath tempered by a sense of justice.",
    },
    {
    "id": "2",
    "name":"Diana Prince",
    "heroName":"Wonder Woman",
    "height":183,
    "weight": 74,
    "specialPower": "Fligth, Speed, Stamina, Superhuman sight",
    "intelligence": 88,
    "strength": 100,
    "power" : 100,
    "speed": 79,
    "agility": 100,
    "imageUrl": "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/720-wonder-woman.jpg",
    "description": "Princess of the Amazons, Goddess of Truth",
    "story" : "Wonder Woman was sculpted from clay by her mother Queen Hippolyta and was given a life to live as an Amazon, along with superhuman powers as gifts by the Greek gods."
    },
    {
    "id": "3",
    "name": "Selina Kyle",
    "heroName": "Catwoman",
    "height": 175,
    "weight": 61,
    "specialPower": "master burglar, gymnast and acrobat",
    "intelligence": 69,
    "strength": 11,
    "power": 27,
    "speed": 33,
    "agility": 85,
    "imageUrl": "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/165-catwoman.jpg",
    "description": "Infamous cat-burglar",
    "story": "As deadly as she is beautiful, infamous cat-burglar Selina Kyle uses her nine lives to walk the razor's edge between light and darkness in Gotham City."
    },
    {
    "id": "4",
    "name": "Peter Parker",
    "heroName": "Spiderman",
    "height": 178,
    "weight": 74,
    "specialPower": "Precognitive spider-sense ability",
    "intelligence": 90,
    "strength": 55,
    "power": 74,
    "speed": 67,
    "agility": 85,
    "imageUrl": "https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/620-spider-man.jpg",
    "description": "Peter Parker's arachnid abilities give him powers he uses to help others, while his personal life offers plenty of obstacles",
    "story": "American teenager Peter Parker, a poor sickly orphan, is bitten by a radioactive spider. As a result of the bite, he gains superhuman strength, speed, and agility along with the ability to cling to walls"
    }
]
----------------------------------------------------------------------------
Get requested hero details using URI - /api/heros/{name}
Response status : 200 ok

Request Method : GET 

Response Body : 

{
"name":"Bruce Wayne ",
"heroName":"Batman",
"height":178,
"weight": 77,
"specialPower": "Genius intellect",
"intelligence": 81,
"strength": 40,
"power" : 63,
"speed": 29,
"agility": 50,
"imageUrl":"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/69-batman.jpg",
"description": "The Dark Knight",
"story" : "After witnessing the murder of his parents Dr. Thomas Wayne and Martha Wayne as a child, he swore vengeance against criminals, an oath tempered by a sense of justice."
}
----------------------------------------------------------------------------

GET Heros :

Acceptance criteria : URI - /api/villains

Response status : 200 OK
Request Method : GET
Response Body:
    [
    {
    "id":1,
    "name":"Maxwell Dillon ",
    "heroName":"Electro",
    "archRival": "Spiderman"
    "height":178,
    "weight": 77,
    "specialPower": "Genius intellect",
    "intelligence": 81,
    "strength": 40,
    "power" : 63,
    "speed": 29,
    "agility": 50,
    "imageUrl":"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/69-batman.jpg",
    "description": "Electro's description",
    "story" : "Electro's story"
    },
    {
    "id":2,
    "name":"Otto Octavius",
    "heroName":"Doctor Octopus",
    "archRival": "Spiderman"
    "height":178,
    "weight": 77,
    "specialPower": "Genius intellect",
    "intelligence": 81,
    "strength": 40,
    "power" : 63,
    "speed": 29,
    "agility": 50,
    "imageUrl":"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/69-batman.jpg",
    "description": "Electro's description",
    "story" : "Electro's story"
    }
    ]


Get requested hero details using URI - /api/villains/{name}
Successful Response status : 200 ok
Error Response status: 404 NOT FOUND

Request Method : GET 

Response Body :
    {
    "id":1,
    "name":"Maxwell Dillon ",
    "heroName":"Electro",
    "archRival": "Spiderman"
    "height":178,
    "weight": 77,
    "specialPower": "Genius intellect",
    "intelligence": 81,
    "strength": 40,
    "power" : 63,
    "speed": 29,
    "agility": 50,
    "imageUrl":"https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/md/69-batman.jpg",
    "description": "Electro's description",
    "story" : "Electro's story"
    }


