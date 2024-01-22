
globals
    integer count = 4
endglobals

native def takes integer a, real b returns nothing

function abc takes nothing returns nothing
endfunction

function helloworld takes boolean b returns boolean
    call BJDebugMsg("moo")
    if 4 > 2 then
        return (false and true)
    endif
endfunction

function selectTest takes integer discriminator returns boolean
    select discriminator
        case 0
            return false
        case 1
            call BJDebugMsg("1")
            return true
        default
            call BJDebugMsg("default")
    endselect

    return false
endfunction
