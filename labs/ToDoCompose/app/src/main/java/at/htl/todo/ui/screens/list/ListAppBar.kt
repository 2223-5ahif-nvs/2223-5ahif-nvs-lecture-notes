package at.htl.todo.ui.screens.list

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import at.htl.todo.R
import at.htl.todo.data.models.Priority
import at.htl.todo.ui.theme.topAppBarBackgroundColor
import at.htl.todo.ui.theme.topAppBarContentColor


@Composable
fun ListAppBar() {
    DefaultListAppBar(
        onSearchClicked = {}
    )
}

@Composable
fun DefaultListAppBar(
    onSearchClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        actions = {
            ListAppBarActions (onSearchClicked = onSearchClicked)
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor
    )
}

@Composable
fun ListAppBarActions(
    onSearchClicked: () -> Unit
){
    SearchAction (onSearchClicked = onSearchClicked)
}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
) {
    IconButton(
        onClick = { onSearchClicked }
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(R.string.search_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun SortAction(
    onSortClicked: (Priority) -> Unit
) {
    var expandend // TODO: Hier fortsetzen 14:01

    IconButton(
        onClick = { }
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = stringResource(id = R.string.sort_action))
    }
    DropdownMenu(
        expanded = ,
        onDismissRequest = { /*TODO*/ }) {
        
    }
}



@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSearchClicked = {}
    )
}