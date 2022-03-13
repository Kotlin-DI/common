package uobject

import (
	"fmt"

	"github.com/IoC-Tools/common"
)

type SetterError struct {
	key   string
	value common.Any
}

func (e SetterError) Error() string {
	return fmt.Sprintf("cannot set %s filed with %v.", e.key, e.value)
}
