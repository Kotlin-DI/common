package uobject

import "github.com/IoC-Tools/common/types"

type Setter interface {
	Set(string) (types.Any, error)
}
