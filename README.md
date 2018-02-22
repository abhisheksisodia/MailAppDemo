# MailAppDemo
Gmail like inbox using RecyclerView that contains the complex list design with interactive animations.

## Screenshots
![Output sample](https://raw.githubusercontent.com/abhisheksisodia/MailAppDemo/master/markAsImportant.gif)

![Output sample](https://raw.githubusercontent.com/abhisheksisodia/MailAppDemo/master/selectAndDelete.gif)

## Components

### RecyclerView
RecyclerView is used to display the list data. The appearance of the list is customized just like Gmail app displaying a thumbnail icon, three line message, timestamp and a star icon to mark the message as important.

### SwipeRefreshLayout
SwipeRefreshLayout is wrapped around the RecyclerView, in order to refresh the inbox. 

### ActionMode
ActionMode is used to display the contextual toolbar when a row is long pressed in the list. This enables to provide set of alternative toolbar icons when the recycler view is in multiple choice mode. This is used to provide delete option to delete the selected messages.

### Object Animators
Object Animators allows to animate a target element and are used here to perform the Flip Animation of list thumbnail icon when a row is long pressed.

### Retrofit
Retrofit library to fetch and deserialize the JSON containing the mock data.
