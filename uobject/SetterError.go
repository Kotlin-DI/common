package uobject

import (
	"fmt"

	"github.com/IoC-Tools/common/types"
)

type SetterError struct {
	key   string
	value types.Any
}

func (e SetterError) Error() string {
	return fmt.Sprintf("cannot set %s filed with %v.", e.key, e.value)
}
