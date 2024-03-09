# Blogging App

## JSON Entities

### User

{
"id" : 223
"username" : "pratyush",
"email" : "chauhanpratyush22@gmail.com",
"password" : "xxxxxxxxx",
"authToken": "knsjwbfvu",
"bio" : "It's a very good blog",
"image" : "https://demo.org"

}

### Profile 
{
"username" : "pratyush",
"bio" : "It's a very good blog",
"image" : "https://demo.org"

}

### Article 

{
"id" : 1234
"title" : "How  India lost the World cup 2023",
"subtitle" : " a night to remember for all fans ",
"body" : " On night of 19 Nov .....<b> World cup </b> .... <i> 2023</i> ..",
"created At " : "2023-11-20 09:45:44"
"tags" : ["cricket", "virat", "rohit"]
}

###  Comment 
{
"id" : 1234
"title" : "great article",
"body": " this was a good article",
"created At" : "2023-11-20 10:50:40"
}

## API Endpoints

### `POST /users`
create a new user

### `POST /users/login`

### `GET /profiles`📄

### `GET /profiles/{username}`

### `GET /articles`📄
get all articles 
available filters 
- `/articles?tag=stocks`
- `/articles?author=pratyush`
- `/articles?page=3&size=10`

### `GET /articles/{article-slug}`

### `POST /articles`🔐
create a new article

### `PATCH/articles/{article-slug}`🔐🚹
edit an article

### `GET/article/{article-slug}/comments`📄
get all comments of an article

### `POST /article/{article-slug}/comments`🔐

### `DELETE//article/{article-slug}/comments/{comment-id}`🔐🚹
