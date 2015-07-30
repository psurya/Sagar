$(document).ready(function()
{
    $('.add').click(function() {
    if ($(this).attr('value') == 'show') {
        $(this).attr('value', 'hide');
        $('.toggle').slideDown();
    } else {
        $(this).attr('value', 'show');
        $('.toggle').slideUp();
    }
    $('.toggle').slideToggle();
	});
    
});
$(document).ready(function()
{
    $('.contact').click(function() {
    if ($(this).attr('value') == 'show') {
        $(this).attr('value', 'hide');
        $('.togglecontact').slideDown();
    } else {
        $(this).attr('value', 'show');
        $('.togglecontact').slideUp();
    }
    $('.togglecontact').slideToggle();
    });
    
});
$(document).ready(function()
{
    $('.Demo').click(function() {
    if ($(this).attr('value') == 'show') {
        $(this).attr('value', 'hide');
        $('.toggleDemo').slideDown();
    } else {
        $(this).attr('value', 'show');
        $('.toggleDemo').slideUp();
    }
    $('.toggleDemo').slideToggle();
    });
    
});
$(document).ready(function() {
    var dropdownlist = $(".dropdownlist").kendoMultiSelect().data("kendoMultiSelect");

  });