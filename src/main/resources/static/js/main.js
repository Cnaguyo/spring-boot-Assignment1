function displayTeachers(teachers) {
// First, select teacher container element
var teacherCourseContainer = $('#teacherCourseContainer');
// Empty it, so we can start over
teacherCourseContainer.empty();
$('#teacherCourseContainer').append('<tr><td> id </td><td>teacher name</td></tr>');
// Now, loop over all teachers
$.each(teachers, function(index, teacher) {
// For every teacher, append a <p> element with the id and name of
    $('#teacherCourseContainer').append('<tr><td> ' + teacher.id +'</td><td> ' +
            teacher.name + '</td></tr>');
});
}


function getTeachers() {
$.get('api/teachers', function(teachers) {
displayTeachers(teachers);
  });

}
$(document).ready(function() {
$('#getTeachersButton').click(getTeachers);
});