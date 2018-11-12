export default function displayTab(id) {
    document.getElementById(id).style.display = 'inline-block';
    document.getElementsByClassName('my-tabs').item(0).style.display = 'block';

}