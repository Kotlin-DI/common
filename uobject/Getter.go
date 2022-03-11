package uobject

import "github.com/IoC-Tools/common/types"

type Getter interface {
	Get(string) (types.Any, error)
}
