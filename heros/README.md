
GET Heros :

Acceptance criteria : URI - /api/heros

Response status : 200 ok
Request Method : GET

Response Body:
[
    {
    "hero_name":"Batman",
    "special_power":"super car",
    "height":"170",
    "weight":"180",
    "real_name":"Bruce Wayne",
    "image_url": "https://rb.gy/r8g78a"
    },
    {
    "hero_name":"Superman",
    "special_power":"Can Fly",
    "height":"175",
    "weight":"182",
    "real_name":"Kal-El",
    "image_url": "https://rb.gy/cnpxsj"
    },
    {
    "hero_name":"Flash",
    "special_power":"Can flash",
    "height":"176",
    "weight":"189",
    "real_name":"Jay Garrick"
    "image_url": "https://rb.gy/r8g78a"
    }
]
----------------------------------------------------------------------------
Get requested hero details using URI - /api/heros/{name}
Response status : 200 ok

Request Method : GET 

Response Body : 

{
"hero_name":"Flash",
"special_power":"Can flash",
"height":"176",
"weight":"189",
"real_name":"Jay Garrick"
"image_url": "https://rb.gy/r8g78a"
}
----------------------------------------------------------------------------