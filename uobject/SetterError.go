package uobject

import (
	"fmt"

	"github.com/IoC-Tools/common"
)

type SetterError struct {
	key   string
	value common.Any
	cause error
}

func (e SetterError) Error() string {
	return fmt.Sprintf("cannot set %s field with %v: %s", e.key, e.value, e.cause.Error())
}
